package polymorphism;

public class SonySpeaker implements Speaker {
	public SonySpeaker () {
		System.out.println("===> SonySpearker ��ü ����");
	}
	
	public void volumeUp() {
		System.out.println("SonySpeaker--�Ҹ� �ø���...");
	}
	
	public void volumeDown() {
		System.out.println("SonySpeaker--�Ҹ� ������...");
	}
}