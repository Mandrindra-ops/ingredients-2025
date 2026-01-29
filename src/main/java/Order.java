import java.time.Instant;
import java.util.List;
import java.util.Objects;

public class Order {
    private Integer id;
    private String reference;
    private Instant creationDatetime;
    private List<DishOrder> dishOrders;

    // NOUVEAU : Statut de paiement
    private PaymentStatusEnum paymentStatus;

    // NOUVEAU : Référence à la vente (optionnelle)
    private Sale sale;

    // Constructeur par défaut - initialise le statut à UNPAID
    public Order() {
        this.paymentStatus = PaymentStatusEnum.UNPAID;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Order order)) return false;
        return Objects.equals(id, order.id) && Objects.equals(reference, order.reference) && Objects.equals(creationDatetime, order.creationDatetime) && Objects.equals(dishOrders, order.dishOrders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, reference, creationDatetime, dishOrders);
    }

    // Getters et setters existants...
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Instant getCreationDatetime() {
        return creationDatetime;
    }

    public void setCreationDatetime(Instant creationDatetime) {
        this.creationDatetime = creationDatetime;
    }

    public List<DishOrder> getDishOrders() {
        return dishOrders;
    }

    public void setDishOrders(List<DishOrder> dishOrders) {
        this.dishOrders = dishOrders;
    }

    // NOUVEAUX getters et setters pour paymentStatus et sale

    public PaymentStatusEnum getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatusEnum paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Sale getSale() {
        return sale;
    }

    public void setSale(Sale sale) {
        this.sale = sale;
    }

    // Méthodes utilitaires pour faciliter les tests
    public boolean isPaid() {
        return PaymentStatusEnum.PAID.equals(this.paymentStatus);
    }

    public boolean hasSale() {
        return this.sale != null;
    }

    // Méthodes pour calculer les totaux (à implémenter plus tard si besoin)
    public double getTotalAmountWithoutVAT() {
        // Pour l'instant, retourner 0.0
        // Vous implémenterez le calcul réel plus tard
        return 0.0;
    }

    public double getTotalAmountWithVAT() {
        // Pour l'instant, retourner 0.0
        // Vous implémenterez le calcul réel plus tard
        return 0.0;
    }
}