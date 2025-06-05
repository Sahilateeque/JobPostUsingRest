package com.example.JobPostUsingRest.service;


import com.example.JobPostUsingRest.model.JobPost;
import com.example.JobPostUsingRest.repo.JobRepo;
import com.example.JobPostUsingRest.repo.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobService {

    @Autowired
    private JobRepository jobRepo;

    public void addJob(JobPost jobPost){
        jobRepo.save(jobPost);
    }

    public List<JobPost> findAllJobPost(){
       return jobRepo.findAll();
    }

    public JobPost getJob(int jobPostId) {
        return jobRepo.findById(jobPostId).orElse(new JobPost());
    }

    public void update(JobPost jobPost) {
        jobRepo.save(jobPost);
    }


    public void delete(int jobPostId) {
        jobRepo.deleteById(jobPostId);
    }

    public List<JobPost> search(String keyword){
        return jobRepo.findByPostProfileContainingOrPostDesc(keyword,keyword);
    }
}
