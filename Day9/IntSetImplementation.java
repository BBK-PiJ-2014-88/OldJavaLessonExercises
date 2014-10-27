public class IntSetImplementation implements IntSet{
	int element = 0;
	IntSetImplementation right;
	IntSetImplementation left;

	public IntSetImplementation(int num){
		this.element = num;
	}

	public void add(int newNum){
		if(this.contains(newNum) == false){
			if (newNum > this.element){
				if (this.right == null){
					this.right = new IntSetImplementation(newNum);
				}
				else{
					this.right.add(newNum);
				}
			}
			else{
				if (this.left == null){
					this.left = new IntSetImplementation(newNum);
				}
				else{
					this.left.add(newNum);
				}
			}
		}
	}


	public boolean contains (int num){
		if (this.element == num){
			return true;
		}
		else if (num > this.element){
			if (this.right == null){
				return false;
			}
			else{
				return this.right.contains(num);
			}
		}
		else{
			if (this.left == null){
				return false;
			}
			else{
				return this.left.contains(num);
			}
		}
	}

	public boolean containsVerbose(int num){
			System.out.println("Checked: " + this.element);
			if (this.element == num){
				return true;
			}
			else if (num > this.element){
				if (this.right == null){
					return false;
				}
				else{
					return this.right.contains(num);
				}
			}
			else{
				if (this.left == null){
					return false;
				}
				else{
					return this.left.contains(num);
				}
		}
	}


	public String toString(){
	}

}