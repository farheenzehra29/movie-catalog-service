package com.example.movieinfoservice.repository;

        import com.example.movieinfoservice.model.Movie;
        import org.bson.types.ObjectId;
        import org.springframework.data.mongodb.repository.MongoRepository;

public interface MovieInfoRepository extends MongoRepository<Movie, ObjectId> {
    public Movie findById(double id);
}
