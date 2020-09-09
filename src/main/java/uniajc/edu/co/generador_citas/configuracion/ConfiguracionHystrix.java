package uniajc.edu.co.generador_citas.configuracion;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "hystrix.command.default")
public class ConfiguracionHystrix {

	private CircuitBreaker circuitBreaker = new CircuitBreaker();
	private Execution execution = new Execution();

	public CircuitBreaker getCircuitBreaker() {
		return circuitBreaker;
	}

	public void setCircuitBreaker(CircuitBreaker circuitBreaker) {
		this.circuitBreaker = circuitBreaker;
	}

	public Execution getExecution() {
		return execution;
	}

	public void setExecution(Execution execution) {
		this.execution = execution;
	}

	public class CircuitBreaker {

		public String enabled;

		public String getEnabled() {
			return enabled;
		}

		public void setEnabled(String enabled) {
			this.enabled = enabled;
		}

	}

	public class Execution {

		public Timeout timeout = new Timeout();
		public Isolation isolation = new Isolation();

		public Timeout getTimeout() {
			return timeout;
		}

		public void setTimeout(Timeout timeout) {
			this.timeout = timeout;
		}

		public Isolation getIsolation() {
			return isolation;
		}

		public void setIsolation(Isolation isolation) {
			this.isolation = isolation;
		}

		public class Timeout {

			public String enabled;

			public String getEnabled() {
				return enabled;
			}

			public void setEnabled(String enabled) {
				this.enabled = enabled;
			}

		}

		public class Isolation {

			public Thread thread = new Thread();

			public Thread getThread() {
				return thread;
			}

			public void setThread(Thread thread) {
				this.thread = thread;
			}

			public class Thread {

				public String interruptOnTimeout;
				public String timeoutInMilliseconds;

				public String getInterruptOnTimeout() {
					return interruptOnTimeout;
				}

				public void setInterruptOnTimeout(String interruptOnTimeout) {
					this.interruptOnTimeout = interruptOnTimeout;
				}

				public String getTimeoutInMilliseconds() {
					return timeoutInMilliseconds;
				}

				public void setTimeoutInMilliseconds(String timeoutInMilliseconds) {
					this.timeoutInMilliseconds = timeoutInMilliseconds;
				}

			}

		}
	}

}
