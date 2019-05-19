import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restFB.types.Page;
import com.restFB.types.Post;
import com.restFB.types.comments;
import java.util.List;


public class Main{
	public static void main(String[] args)
	String accessToken = "";
	FacebookClient fbClient = new DefaultFacebookClient(accessToken);
	Page page = fbClient.fetchObject("VITWale",Page.class);

	Connecttion<Post> postFeed = fbClient.fetchConnection(page.getId()+ "/feed",comments.class);

	for(List<Post> postPage : postFeed){

		for(Post apost : postPage){

			System.out.println(aPost.getFrom().getName());
			System.out.println("-->"+aPost.getMessage());
			System.out.println("fb.com/"+aPost.getId());
		}
	}

}
