public interface Communication {
	public boolean connect(Login input);
	public boolean disconnect();
	public User receiveUser();
	public boolean sendUser();
	public Restaraunt receiveRestaraunt();
	public boolean sendRestaraunt(Restaraunt input);
	public boolean sendOrder(Order input);
	public Order receiveOrder();
}
