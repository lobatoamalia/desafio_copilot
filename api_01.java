// NewsController.java - Versão melhorada
@RestController
@RequestMapping("/api/news")
@Tag(name = "News API", description = "Endpoints for financial news")
public class NewsController {

    private final NewsService newsService;
    private final NewsMapper newsMapper;

    @Autowired
    public NewsController(NewsService newsService, NewsMapper newsMapper) {
        this.newsService = newsService;
        this.newsMapper = newsMapper;
    }

    @GetMapping
    @Operation(summary = "Get all news")
    public ResponseEntity<List<NewsResponseDTO>> getAllNews() {
        List<News> news = newsService.findAll();
        return ResponseEntity.ok(newsMapper.toDtoList(news));
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get news by ID")
    public ResponseEntity<NewsResponseDTO> getNewsById(@PathVariable Long id) {
        News news = newsService.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("News not found with id: " + id));
        return ResponseEntity.ok(newsMapper.toDto(news));
    }

    @PostMapping
    @Operation(summary = "Create new news")
    public ResponseEntity<NewsResponseDTO> createNews(@Valid @RequestBody NewsRequestDTO newsDto) {
        News news = newsMapper.toEntity(newsDto);
        News savedNews = newsService.save(news);
        return ResponseEntity
                .created(URI.create("/api/news/" + savedNews.getId()))
                .body(newsMapper.toDto(savedNews));
    }
}