import org.vertx.scala.core.net.NetSocket
import org.vertx.scala.core.streams.Pump

vertx.createNetServer().connectHandler({ socket: NetSocket =>
  Pump.createPump(socket, socket).start
}).listen(1234)
