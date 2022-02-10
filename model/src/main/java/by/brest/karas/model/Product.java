package by.brest.karas.model;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.Objects;

public class Product {

    private Integer productId;

    private String picture;

    private String shortDescription;

    private String detailDescription;

    private BigDecimal price;

    private Date creationDate;

    private Date updateDate;

    private Integer changedBy;

    public Product() {
    }

    public Product(String picture, String shortDescription, String detailDescription, BigDecimal price, Date creationDate, Date updateDate, Integer changedBy) {
        this.picture = picture;
        this.shortDescription = shortDescription;
        this.detailDescription = detailDescription;
        this.price = price;
        this.creationDate = creationDate;
        this.updateDate = updateDate;
        this.changedBy = changedBy;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getDetailDescription() {
        return detailDescription;
    }

    public void setDetailDescription(String detailDescription) {
        this.detailDescription = detailDescription;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Integer getChangedBy() {
        return changedBy;
    }

    public void setChangedBy(Integer changedBy) {
        this.changedBy = changedBy;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Objects.equals(getProductId(), product.getProductId()) && Objects.equals(getPicture(), product.getPicture()) && Objects.equals(getShortDescription(), product.getShortDescription()) && Objects.equals(getDetailDescription(), product.getDetailDescription()) && Objects.equals(getPrice(), product.getPrice()) && Objects.equals(getCreationDate(), product.getCreationDate()) && Objects.equals(getUpdateDate(), product.getUpdateDate()) && Objects.equals(getChangedBy(), product.getChangedBy());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProductId(), getPicture(), getShortDescription(), getDetailDescription(), getPrice(), getCreationDate(), getUpdateDate(), getChangedBy());
    }

    @Override
    public String toString() {
        return getClass().getName() + "{" +
                "productId=" + productId +
                ", picture='" + picture + '\'' +
                ", shortDescription='" + shortDescription + '\'' +
                ", detailDescription='" + detailDescription + '\'' +
                ", price=" + price +
                ", creationDate=" + creationDate +
                ", updateDate=" + updateDate +
                ", changedBy=" + changedBy +
                '}';
    }
}
