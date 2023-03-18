# plainsbt-example

An example project using the [`plainsbt`](https://github.com/ghik/plainsbt) plugin.

The directory structure of this project is:

```
myproj/
  commons/
    db/
    api/
  fooservice/
    api/
    impl/
  barservice/
    api/
    impl/
```

Which corresponds to the following set of `sbt` projects:

```
myproj
myproj-commons
myproj-commons-db
myproj-commons-api
myproj-fooservice
myproj-fooservice-api
myproj-fooservice-impl
myproj-barservice
myproj-barservice-api
myproj-barservice-impl
```

