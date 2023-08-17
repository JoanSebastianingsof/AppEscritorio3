package co.edu.ue.model;

import java.util.ArrayList;
import java.util.List;

public class Course {
	private String name;
	private double duration;
	private double cost;
	ArrayList<Course> listCourses=new ArrayList<Course>();
	public Course() {
		
	}
	public Course(String name, double duration, double cost) {
		super();
		this.name = name;
		this.duration = duration;
		this.cost = cost;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	//Lista de cursos
	public ArrayList<Course> listCourses(){
		listCourses.add(new Course("Java",60.0,150.0));
		listCourses.add(new Course("Javascript",20.0,50.0));
		listCourses.add(new Course("Php",40.0,70.0));
		listCourses.add(new Course("Python",80.0,170.0));
		listCourses.add(new Course("C#",40.0,60.0));
		return (listCourses);
	}
	//Buscar curso
	public List<Course>searchCourses(String name){
		List<Course> list_aux=new ArrayList<>();
		List<Course> list_return=new ArrayList<>();
		list_aux=this.listCourses();
		/*int[]array = new int [3];
		for (int e:array) {
			
		}*/
		for(Course c: list_aux) {
			if(c.getName().contains(name)) {
				list_return.add(c);
			}
		}
		return list_return;
	}
	//agregar curso
	public ArrayList<Course>postCourse(Course course){
		ArrayList<Course> list_aux=new ArrayList<>();
		list_aux=this.listCourses();
		list_aux.add(course);
		this.listCourses=list_aux;
		return this.listCourses;
		
	}
	//Eliminar
	public ArrayList<Course>deleteCourse(String name){
		ArrayList<Course> list_aux=new ArrayList<>();
		list_aux= this.listCourses();
		list_aux.removeIf(c->c.getName().equals(name));
		return this.listCourses;
	}
	//Actualizar
	public ArrayList<Course>updateCourse(Course course,String name){
		ArrayList<Course> list_aux=new ArrayList<>();
		list_aux= this.listCourses();
		for( int i = 0; i < list_aux.size(); i++) {
			if(list_aux.get(i).getName().contains(name)) {
				list_aux.get(i).setDuration(course.getDuration());
				list_aux.get(i).setCost(course.getCost());
				
			}
		}
	

		return this.listCourses;
	}

}
