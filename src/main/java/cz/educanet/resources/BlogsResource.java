package cz.educanet.resources;


import cz.educanet.models.Blog;

import cz.educanet.models.BlogCreationModel;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Path("blogs")
@Produces(MediaType.APPLICATION_JSON)
public class BlogsResource {

    private BlogsRepository blogsRepository = new BlogsRepository;
    private final List<Blog> blogList = blogsRepository.load();

    @GET
    public Response getAll() {
        return Response.ok(blogList).build();
    }

    @POST
    public Response createBlog(BlogCreationModel newBlog) {
        Blog blog = new Blog(newBlog.getTitle(), newBlog.getArticle());
        blogList.add(blog);

        return Response.ok(blog).build();
    }


}
