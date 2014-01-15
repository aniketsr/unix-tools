unix-tools commands
==========
unix-tools contains replication of unix tools like ` wc , cut , sort , head , tail , uniq , SpaceReducer ` etc

#### wc(WordCount) :

* counts characters,words,and lines in a file.

```
Wc.sh filename
```

#### Cut :

* cuts specified field in a file.
* specify field with -f fieldNumber  for eg -f2.
* specify delimiter with -d , default delimiter is space.

```
Cut.sh filename -f2
```

#### Sort :

* sorts data by lines in a file.
For eg.
```
Sort.sh filename
```
* specify -r for reversing the sorted result.
For eg.
```
Sort.sh filename -r
```


#### Head :

* gives header lines in the file.
* To get n number of lines specify -n , default is 10

```
Head.sh filename -5
```

#### Tail :

* gives tailer lines in the file.
* To get n number of lines specify -n , default is 10

```
Tail.sh filename -5
```

#### Uniq :

* gives uniq lines in a file.
* eliminates concurrent duplicate lines in a file.

```
Uniq.sh filename
```

#### Space-Reducer :

* removes all extra spaces in the specified file.

```
SpaceReducer.sh filename
```

#How to run project on your system :

* For every session you have to run this simple command and you are done!!!
 ` declare -x UNIX_HOME=$PWD `

* Then you can run any unix-tools using shell command
 For eg. ` sh Head.sh filename.txt`