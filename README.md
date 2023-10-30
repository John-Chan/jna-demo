
## build

build the native library

```shell
cd dylib
make

```

build java application

```shell
cd java-src
./mvnw clean package

```

## run

```shell
cd java-src
# the native library path, see java-src/run.sh
export LIB_PATH=path-to-project-root/dylib
./run.sh
```