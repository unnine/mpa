package mpa.fixture.service;

import default$.MyLike;
import default$.repository.MyLikeRepository;
import mpa.persistence.annotation.Mutations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestMyLikeService {

    @Autowired
    private MyLikeRepository likeRepository;


    @Mutations("insert like test")
    public void insert(MyLike like) {
        likeRepository.insert(like);
    }

    @Mutations("update like test")
    public void update(MyLike like) {
        likeRepository.update(like);
    }

    @Mutations("delete like test")
    public void delete(Integer id) {
        likeRepository.delete(id);
    }

}
