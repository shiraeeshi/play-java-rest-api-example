package v1.post;

/**
 * Resource for the API.  This is a presentation class for frontend work.
 */
public class PostResource {
    private String id;
    private String name;
    private int price;

    public PostResource() {
    }

    public PostResource(String id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public PostResource(PostData data) {
        this.id = data.id.toString();
        this.name = data.name;
        this.price = data.price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

}
