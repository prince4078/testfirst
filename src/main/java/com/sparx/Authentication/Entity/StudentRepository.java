package com.sparx.Authentication.Entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Integer> {
//    @Query("SELECT *\n" +
//            "FROM student\n" +
//            "WHERE name LIKE '%?1%'\n" +
//            "AND (batch = COALESCE(?2, batch) OR batch = '')\n" +
//            "AND (state = COALESCE(?3, state) OR state = '');\n")
//    public List<Student> searchByNameandBatchandState(String keyword, String batch, String state);
@Query("SELECT s FROM Student s " +
        "WHERE s.name LIKE %:keyword% " +
        "AND (s.batch = COALESCE(:batch, s.batch) OR s.batch = '') " +
        "AND (s.state = COALESCE(:state, s.state) OR s.state = '')")
public List<Student> searchByNameAndBatchAndState(@Param("keyword") String keyword,
                                                  @Param("batch") String batch,
                                                  @Param("state") String state);

}
