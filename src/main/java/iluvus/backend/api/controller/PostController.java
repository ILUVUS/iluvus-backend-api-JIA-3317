package iluvus.backend.api.controller;

import iluvus.backend.api.model.Post;
import iluvus.backend.api.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/post")
public class PostController {

    @Autowired
    private PostService postService;

    /**
     * 
     * @param data JSON object with the following keys:
     *             text: String
     *             dateTime: String
     *             authorId: String
     *             communityId: String
     * 
     * @return
     */
    @PostMapping(value = "/create", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Post>> createPost(@RequestBody Map<String, String> data) {

        List<Post> newPost = postService.createPost(data);

        if (newPost != null) {
            return ResponseEntity.ok().body(newPost);
        } else {
            return ResponseEntity.badRequest().body(null);
        }
    }

    /**
     * write a comment
     * 
     * @param data JSON object with the following keys:
     *             postId: String
     *             authorId: String
     *             text: String
     *             dateTime: String
     * 
     * @return
     */
    @PostMapping(value = "/comment", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<HashMap<String, String>>> commentPost(@RequestBody Map<String, String> data) {
        List<HashMap<String, String>> newComment = postService.writeComment(data);

        if (newComment != null) {
            return ResponseEntity.ok().body(newComment);
        } else {
            return ResponseEntity.badRequest().body(null);
        }
    }

    @PostMapping(value = "/like", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Integer> likePost(@RequestBody Map<String, String> data) {
        int upLifeNumber = postService.likePost(data);
        if (upLifeNumber != -1) {
            return ResponseEntity.ok().body(upLifeNumber);
        } else {
            return ResponseEntity.badRequest().body(0);
        }

    }

    @PostMapping(value = "/getAllComments", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<HashMap<String, String>>> getAllComments(@RequestBody Map<String, String> data) {
        List<HashMap<String, String>> allComments = postService.getAllComments(data);

        if (allComments != null) {
            return ResponseEntity.ok().body(allComments);
        } else {
            return ResponseEntity.badRequest().body(null);
        }
    }

    /**
     * /post/getPostsByCommunityID?id=
     * 
     * @return
     */
    @GetMapping(value = "/getPostsByCommunityID", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Post>> getAllCommunity(@RequestParam String id) {
        List<Post> posts = postService.getPostsByCommunityId(id);
        if (posts != null && !posts.isEmpty()) {
            return ResponseEntity.ok().body(posts);
        } else {
            return ResponseEntity.badRequest().body(null);
        }
    }

    @PostMapping(value = "/report", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> reportPost(@RequestBody Map<String, String> data) {
        boolean isReported = postService.reportPost(data);
        if (isReported) {
            return ResponseEntity.ok().body("Post reported successfully");
        } else {
            return ResponseEntity.badRequest().body("Post reporting failed");
        }
    }

}
