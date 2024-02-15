package iluvus.backend.api.service;

import iluvus.backend.api.dto.PostDto;
import iluvus.backend.api.model.Community;
import iluvus.backend.api.model.Post;
import iluvus.backend.api.model.User;
import iluvus.backend.api.repository.CommunityRepository;
import iluvus.backend.api.repository.PostRepository;
import iluvus.backend.api.repository.UserRepository;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// create post service class
@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private CommunityRepository communityRepository;

    // create post method
    public boolean createPost(Map<String, String> data) {
        try {
            PostDto postDto = new PostDto();

            postDto.setContent(data.get("content"));
            postDto.setDateTime(data.get("datetime"));
            postDto.setImages(new ArrayList<String>());
            postDto.setComments(new ArrayList<String>());
            postDto.setUplift(BigInteger.valueOf(0));
            postDto.setVisible(Boolean.valueOf(data.get("visible")));

            User owner = userRepository.findById(data.get("ownerId")).get();
            postDto.setAuthor(owner);

            Community group = communityRepository.findById(data.get("groupId")).get();
            postDto.setGroup(group);

            Post post = new Post(postDto);

            postRepository.insert(post);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean likePost(Map<String, String> data) {
        try {
            String postId = data.get("postId");
            Post post = postRepository.findById(postId).orElse(null);
            if (post == null) {
                return false;
            }
            System.out.println("Post id: " + post.getId());
            System.out.println("Post Content: " + post.getContent());
            System.out.println("Post Author: " + post.getAuthor());
            System.out.println("Post DateTime: " + post.getDateTime());
            System.out.println("Post uplift: " + post.getUplift());

            BigInteger uplift = post.getUplift();
            BigInteger addedBigInteger = uplift.add(BigInteger.ONE);
            post.setUplift(addedBigInteger);
            postRepository.save(post);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        
    }
}
