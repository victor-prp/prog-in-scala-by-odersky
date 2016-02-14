package samples

import com.jcabi.ssh._


/**
 * @author victorp
 */
object SshTest extends App{

  val shell = new Shell.Plain(new SSHByPassword(
    "127.0.0.1", 2222,
    "vagrant", "vagrant"
  ))
  println(shell.exec("echo 'Hello, world!'"))
  println(shell.exec("sudo /bin/systemctl stop occm.service"))
  Thread.sleep(5000)
  println(shell.exec("sudo /bin/systemctl start occm.service"))




  //  println(shell.exec("service occm stop\n"))
}
