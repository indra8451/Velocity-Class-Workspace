package ProcessImprovments;

import java.util.Optional;

public class ProcessInfoUsingProcessID {

	public static void main(String[] args) {

		Optional<ProcessHandle> op = ProcessHandle.of(10640);
		if (op.isPresent()) {
			ProcessHandle p = op.get();
			System.out.println(p.isAlive());
			System.out.println(p.info().startInstant());
			System.out.println(p.info().totalCpuDuration());
			System.out.println(p.info().user().get());
			System.out.println(p.info().command());
		}
	}

}
