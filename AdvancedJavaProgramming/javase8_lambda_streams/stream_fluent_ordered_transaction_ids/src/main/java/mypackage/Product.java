package mypackage;

public class Product {
	private Integer productId;
	private ProductType productType;
	private Integer price;
	
	public Product(Integer productId, ProductType productType, Integer priceFields) {
		this.productId = productId;
		this.productType = productType;
		this.price = priceFields;
	}

	public Integer getProductId() {
		return productId;
	}
	
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	
	public ProductType getProductType() {
		return productType;
	}
	
	public void setProductType(ProductType productType) {
		this.productType = productType;
	}
	
	public Integer getPrice() {
		return price;
	}
	
	public void setPrice(Integer price) {
		this.price = price;
	}
}
