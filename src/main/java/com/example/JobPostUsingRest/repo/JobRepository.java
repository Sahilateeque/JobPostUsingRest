package com.example.JobPostUsingRest.repo;

import com.example.JobPostUsingRest.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobRepository extends JpaRepository<JobPost, Integer> {

    List<JobPost> findByPostProfileContainingOrPostDesc(String postProfile,String postDesc);
}
