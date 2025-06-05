package com.example.JobPostUsingRest.repo;


import com.example.JobPostUsingRest.model.JobPost;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {

    List<JobPost> jobs = new ArrayList<>(Arrays.asList(

            new JobPost(1, "Java Developer", "Good Knowledge of java", 0,
                     Arrays.asList("Core Java", "J2EE", "Spring Boot", "Hibernate")),

            new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React", 3,
                     List.of("HTML", "CSS", "JavaScript", "React")),


            new JobPost(3, "Data Scientist", "Strong background in machine learning and data analysis", 4,
                     List.of("Python", "Machine Learning", "Data Analysis")),


            new JobPost(4, "Network Engineer", "Design and implement computer networks for efficient data communication", 5,
                    List.of("Networking", "Cisco", "Routing", "Switching")),


            new JobPost(5, "Mobile App Developer", "Experience in mobile app development for iOS and Android", 3,
                     List.of("iOS Development", "Android Development", "Mobile App"))
    )
    );




    public List<JobPost> findAll() {
        return jobs;
    }

    public void addJob(JobPost jobPost) {
        jobs.add(jobPost);
        System.out.println(jobs);
    }

    public JobPost jobPost(int jobPostId) {

        for(JobPost job : jobs){
            if(job.getPostId() == jobPostId){
                return job;
            }
        }
        return null;
    }

    public void update(JobPost jobPost) {

        for(JobPost jobPost1 : jobs){
            if(jobPost1.getPostId() == jobPost.getPostId()){
                jobPost1.setPostDesc(jobPost.getPostProfile());
                jobPost1.setPostProfile(jobPost.getPostDesc());
                jobPost1.setReqExperience(jobPost.getReqExperience());
            }
        }

    }

    public void delete(int jobPostId) {
        for (JobPost jobPost : jobs){
            if(jobPost.getPostId() == jobPostId){
                jobs.remove(jobPost);
            }
        }

    }
}


