package com.example.schedulerpractice.repository;

import com.example.schedulerpractice.entity.SchedulerJobInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchedulerRepository extends JpaRepository< SchedulerJobInfo, Long > {

	SchedulerJobInfo findByJobName( String jobName );

}
