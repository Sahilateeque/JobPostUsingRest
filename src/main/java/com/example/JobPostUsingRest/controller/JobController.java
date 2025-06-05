package com.example.JobPostUsingRest.controller;

import com.example.JobPostUsingRest.model.JobPost;
import com.example.JobPostUsingRest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class JobController {

    @Autowired
    private JobService jobService;

    @GetMapping("JobPosts")
    public List<JobPost> findAllPost(){
        return jobService.findAllJobPost();
    }

    @GetMapping("JobPost/{jobPostId}")
    public JobPost getJob(@PathVariable("jobPostId") int jobPostId){
        return jobService.getJob(jobPostId);
    }

    @GetMapping("JobPosts/keyword/{keyword}")
    public List<JobPost> search(@PathVariable("keyword") String keyword){
        return jobService.search(keyword);
    }

    @GetMapping("JobPosts/experience/{experience}")
    public List<JobPost> searchByReqExperience(@PathVariable("experience") int experience){
        return jobService.searchByExp(experience);
    }

    @PostMapping("/Job/add")
    public JobPost addJob(@RequestBody JobPost jobPost){
        jobService.addJob(jobPost);
        return jobService.getJob(jobPost.getPostId());
    }

    @PutMapping("/Job/update")
    public JobPost update(@RequestBody JobPost jobPost){
        jobService.update(jobPost);
        return jobService.getJob(jobPost.getPostId());
    }

    @DeleteMapping("/Job/delete/{jobPostId}")
    public String delete(@PathVariable int jobPostId){
        jobService.delete(jobPostId);
        return "Deleted";
    }

}
