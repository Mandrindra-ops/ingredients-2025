import java.time.Instant;

public class Sale {
    private Integer id;
    private Instant creationDate;
    private Order order;

    // Constructeur par défaut - initialise la date de création
    public Sale() {
        this.creationDate = Instant.now();
    }

    // Constructeur avec une commande
    public Sale(Order order) {
        this();
        this.order = order;
    }

    // Getters et setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Instant getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Instant creationDate) {
        this.creationDate = creationDate;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}