package com._NguoiDev.SkillBridge.repository;

import com._NguoiDev.SkillBridge.embedded.AttendanceCheckId;
import com._NguoiDev.SkillBridge.entity.AttendanceCheck;
import com._NguoiDev.SkillBridge.entity.Lesson;
import com._NguoiDev.SkillBridge.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AttendanceCheckRepository extends JpaRepository<AttendanceCheck, AttendanceCheckId> {
    List<AttendanceCheck> findByStudent(Student student);
    List<AttendanceCheck> findByLesson(Lesson lesson);
    Optional<AttendanceCheck> findByStudentAndLesson(Student student, Lesson lesson);
    boolean existsByStudentAndLesson(Student student, Lesson lesson);

    @Query("SELECT ac FROM AttendanceCheck ac WHERE ac.student.id = :studentId AND ac.lesson.classEntity.id = :classId")
    List<AttendanceCheck> findByStudentIdAndClassId(@Param("studentId") int studentId, @Param("classId") int classId);
} 