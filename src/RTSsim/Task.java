package RTSsim;




/**
 * Description of the class Task.
 *
 *
 */
public class Task {

	private String name;
	private Integer iTime;
	public Integer cTime;
	private Integer dTime;
	private Integer pTime;
	private Boolean isRunning = false;
	private Boolean isFinished = false;

	/**
	 * Description of the constructor Task.
	 *
	 * @param name.
	 * @param i.
	 * @param p.
	 * @param c.
	 * @param d.
	 */
	public Task(String name, Integer i, Integer p, Integer c, Integer d) {
		this.name=name;
		this.iTime=i;
		this.cTime=c;
		this.dTime=d;
		this.pTime=p;
	}

	/**
	 * Description of the method changeRunningState.
	 * test Naveen
	 */
	public void changeRunningState() {

	}

	/**
	 * Description of the method setFinished.
	 *
	 */
	void setFinished() {

	}

	/**
	 * Description of the method getName.
	 *
	 */
	public void getName() {

	}

	/**
	 * Description of the method getItime.
	 *
	 */
	public void getItime() {

	}

	/**
	 * Description of the method getCtime.
	 *
	 */
	public void getCtime() {

	}

	/**
	 * Description of the method getDtime.
	 *
	 */
	public void getDtime() {

	}

	/**
	 * Description of the method getPtime.
	 *
	 */
	public void getPtime() {

	}

	/**
	 * Description of the method updateTimers.
	 *
	 */
	public void updateTimers() {

	}


}