package 包装类案例;

public class Check {
	
	private boolean hasDigit;
	private boolean hasUpper;
	private boolean hasLower;
	private boolean hasSpace;
	private boolean hasUnderLine;

	
	private String level = "";
	
	
	public boolean isHasDigit() {
		return hasDigit;
	}
	public void setHasDigit(boolean hasDigit) {
		this.hasDigit = hasDigit;
	}
	public boolean isHasUpper() {
		return hasUpper;
	}
	public void setHasUpper(boolean hasUpper) {
		this.hasUpper = hasUpper;
	}
	public boolean isHasLower() {
		return hasLower;
	}
	public void setHasLower(boolean hasLower) {
		this.hasLower = hasLower;
	}
	public boolean isHasSpace() {
		return hasSpace;
	}
	public void setHasSpace(boolean hasSpace) {
		this.hasSpace = hasSpace;
	}
	public boolean isHasUnderLine() {
		return hasUnderLine;
	}
	public void setHasUnderLine(boolean hasUnderLine) {
		this.hasUnderLine = hasUnderLine;
	}
	
	public String getLevel() {
		
		if(hasDigit) level += "*";
		if(hasUpper) level += "*";
		if(hasLower) level += "*";
		if(hasSpace) level += "*";
		if(hasUnderLine) level += "*";
		
		return level;
	}
	
	

}
