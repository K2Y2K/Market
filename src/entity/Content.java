package entity;

public class Content {
	private int id;
	private int price ;
	private String title ;
	private byte[] icon ;
	private String abstr ;
	private byte[] text ;
	public Content(int id, int price, String title, byte[] icon, String abstr,
			byte[] text) {
		super();
		this.id = id;
		this.price = price;
		this.title = title;
		this.icon = icon;
		this.abstr = abstr;
		this.text = text;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public byte[] getIcon() {
		return icon;
	}
	public void setIcon(byte[] icon) {
		this.icon = icon;
	}
	public String getAbstr() {
		return abstr;
	}
	public void setAbstr(String abstr) {
		this.abstr = abstr;
	}
	public byte[] getText() {
		return text;
	}
	public void setText(byte[] text) {
		this.text = text;
	}
	

}
