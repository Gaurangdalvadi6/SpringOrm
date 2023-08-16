package com.spring.orm1.springorm1.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm1.springorm1.entity.Teacher;

public class TeacherDao {

	
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	@Transactional
	public int insert(Teacher teacher) {
		Integer s = (Integer) this.hibernateTemplate.save(teacher);
		return s;
	}
	
	public Teacher getTeacher(int teacherid) {
		Teacher teacher = this.hibernateTemplate.get(Teacher.class, teacherid);
		return teacher;
	}
	
	public List<Teacher> getAllTeacher(){
		List<Teacher> teachers = this.hibernateTemplate.loadAll(Teacher.class);
		return teachers;
	}
	
	@Transactional
	public void deleteTeacher(int teacherid) {
		Teacher teacher = this.hibernateTemplate.get(Teacher.class, teacherid);
		this.hibernateTemplate.delete(teacher);
	}
	
	@Transactional
	public void updateTeacher(Teacher teacher) {
		this.hibernateTemplate.update(teacher);
	}
}
