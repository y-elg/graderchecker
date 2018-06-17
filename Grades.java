import java.util.ArrayList;

public class Grades implements Classes {
    // instance variables
    public Classes[] grades;
    public int numClasses;
    public float finalGrade;

    public Grades() {
	grades = new Classes[0];
	numClasses = 0;
	float finalGrade = 0;
    }

    public void addClass (Classes name) {
	Classes[] temp = new Classes[numClasses];
	for (int i = 0; i < numClasses; i++)
	    temp[i] = grades[i];
	temp[numClasses] = name;
	grades = temp;
	numClasses++;
    }

    public void addGrade (Classes name, int type, float num) {
	for (int i = 0; i < numClasses; i++) {
	    if (grades[i] == name)
		grades[i].add(type,num);
	    else if (grades[i] != name && i == numClasses - 1) {
		addClass(name);
		grades[i+1].add(type,num);
	    }
	}
    }
    
    public void updateFinal() {
	float sum = 0;
	for (int i = 0; i < numClasses; i++)
	    sum += getGrade(grades[i]);
	finalGrade = sum / numClasses;
    }

    public float getFinal() {
	return finalGrade;
    }
    
    public float getGrade(Classes name) {
	float ret = 0;
	for (int i = 0; i < numClasses; i++)
	    if (grades[i] == name)
		ret = grades[i].getOverall();
	return ret;
    }

    public static void main (String[] args) {
	Classes Math = new Classes();
	Classes Biology = new Classes();
	Grades a = new Grades();
	a.addGrade(Math, 2, 100);
       	a.addGrade(Math, 1, 30);
	a.addGrade(Biology, 4, 50);
	System.out.println(a.getGrade(Math));
	System.out.println(a.getFinal());
    }
}
