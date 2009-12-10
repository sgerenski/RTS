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
	 *
	 */
	public void changeRunningState() {
		this.isRunning=!isRunning;
	}

	/**
	 * Description of the method setFinished.
	 *
	 */
	void setFinished() {
		this.isFinished=true;
	}

	/**
	 * Description of the method getName.
	 * @return 
	 *
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Description of the method getItime.
	 * @return 
	 *
	 */
	public Integer getItime() {
		return this.iTime;
	}
	/**
	 * Description of the method getCtime.
	 * @return 
	 *
	 */
	public Integer getCtime() {
		return this.iTime;
	}

	/**
	 * Description of the method getDtime.
	 * @return 
	 *
	 */
	public Integer getDtime() {
		return  this.dTime;
	}

	/**
	 * Description of the method getPtime.
	 * @return 
	 *
	 */
	public Integer getPtime() {
		return this.pTime;
	}

	/**
	 * Description of the method updateTimers.
	 *
	 */
	public void updateTimers() {

	}


}