import java.util.ArrayList;

public class Classes {
    ArrayList HW, Test, Quiz, Project, Lab;
    int numHW, numTest, numQuiz, numProject, numLab;
    float overall, sumHW, sumTest, sumQuiz, sumProject, sumLab;

    Classes() {
	HW = new ArrayList();
	Test = new ArrayList();
	Quiz = new ArrayList();
	Project = new ArrayList();
	Lab = new ArrayList();
	numHW = 0;
	numTest = 0;
	numQuiz = 0;
	numProject = 0;
	numLab = 0;
	overall = 0;
	sumHW = 0;
	sumTest = 0;
	sumQuiz = 0;
	sumProject = 0;
	sumLab = 0;
    }

    public void add (int type, float num) {
	if (type == 1) {
	    HW.add(num);
	    sumHW += num;
	    numHW++;
	}
	else if (type == 2) {
	    Test.add(num);
	    sumTest += num;
	    numTest++;
	}
	else if (type == 3) {
	    Quiz.add(num);
	    sumQuiz += num;
	    numQuiz++;
	}
	else if (type == 4) {
	    Project.add(num);
	    sumProject += num;
	    numProject++;
	}
	else {
	    Lab.add(num);
	    sumLab += num;
	    numLab++;
	}
    }

    public float average (ArrayList type) {
	float ret = 0;
	if (type == HW)
	    if (numHW == 0) ret = 100;
	    else ret = sumHW / numHW;
	else if (type == Test)
	    if (numTest == 0) ret = 100;
	    else ret = sumTest / numTest;
	else if (type == Quiz)
	    if (numQuiz == 0) ret = 100;
	    else ret = sumQuiz / numQuiz;
	else if (type == Project)
	    if (numProject == 0) ret = 100;
	    else ret = sumProject / numProject;
	else if (type == Lab)
	    if (numLab == 0) ret = 100;
	    else ret = sumLab / numLab;
        return ret;
    }

    public float getOverall() {
	return average(HW) / 10 +  average(Test) / 2 + average(Quiz) / 5 + average(Project) / 10 + average(Lab) / 10;
    }
}
