```
export JAVA_HOME=~/Library/Java/JavaVirtualMachines/liberica-21.0.3/
export GEMFIRE_HOME=~/Downloads/vmware-gemfire-10.1.1
export PATH=${PATH}:${GEMFIRE_HOME}/bin
gfsh start locator --name=locator --dir=${HOME}/locator
gfsh -e "connect" -e "configure pdx --read-serialized=true"
gfsh -e "connect" -e "start server --dir=${HOME}/server --name=server"
```

```
gfsh -e "connect" -e "stop server --dir=${HOME}/server --name=server"
gfsh -e "connect" -e "stop locator --name=locator  --dir=${HOME}/locator"
```
