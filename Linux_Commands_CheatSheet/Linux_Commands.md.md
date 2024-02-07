
# Linux Command Line Cheat Sheet

This document serves as a cheat sheet for some of the most commonly used Linux commands. It's designed to provide quick examples for reference.

## File and Directory Management

- **pwd** - Print the current working directory.
  ```bash
  pwd
  ```

- **ls** - List files and directories.
  ```bash
  ls -a ~  # List all files, including hidden, in the home directory.
  ```

- **mkdir** - Create a new directory.
  ```bash
  mkdir project
  ```

- **cd** - Change directory.
  ```bash
  cd project
  ```

- **touch** - Create an empty file.
  ```bash
  touch index.html
  ```

- **cp** - Copy files or directories.
  ```bash
  cp index.html index_backup.html
  ```

- **mv** - Move or rename files or directories.
  ```bash
  mv index_backup.html backup/
  ```

- **echo** - Display a line of text/string that is passed as an argument.
  ```bash
  echo "Hello, World!" > index.html
  ```

- **cat** - Concatenate files and print on the standard output.
  ```bash
  cat index.html
  ```

- **wc** - Print newline, word, and byte counts for each file.
  ```bash
  wc -l index.html
  ```

## System Information and Management

- **ps** - Report a snapshot of the current processes.
  ```bash
  ps
  ```

- **kill** - Send a signal to a process, usually related to stopping the process.
  ```bash
  kill 1234
  ```

- **date** - Display or set the system date and time.
  ```bash
  date
  ```

- **history** - Show the command-line history.
  ```bash
  history
  ```

## Networking

- **ifconfig/ip addr** - Configure or display network interface parameters.
  ```bash
  ifconfig
  ```
  
- **ping** - Check the network connection to a server.
  ```bash
  ping -c 4 google.com
  ```

- **nslookup/dig** - Query Internet name servers for DNS lookups.
  ```bash
  nslookup google.com
  ```

## File Permissions and Editing

- **chmod** - Change the file modes or Access Control Lists.
  ```bash
  chmod g+w index.html
  ```

- **sed** - Stream editor for filtering and transforming text.
  ```bash
  sed -i 's/World/Bash/g' index.html
  ```

## File Compression and Archives

- **tar** - An archiving utility.
  ```bash
  tar -czvf backup.tar.gz backup/
  tar -xzvf backup.tar.gz
  ```

## Downloading and Web Requests

- **curl** - Transfer data from or to a server.
  ```bash
  curl http://example.com -o page.html
  ```

- **wget** - Non-interactive network downloader.
  ```bash
  wget http://example.com/file
  ```

## Text Processing

- **grep** - Search for patterns in files.
  ```bash
  grep "World" index.html
  ```

- **sort** - Sort lines of text files.
  ```bash
  sort page.html
  ```

- **head** - Output the first part of files.
  ```bash
  head -n 10 page.html
  ```

- **tail** - Output the last part of files.
  ```bash
  tail -n 10 page.html
  ```

## Disk Usage

- **du** - Estimate file space usage.
  ```bash
  du -sh project
  ```

## Environment and Variables

- **export** - Set an environment variable.
  ```bash
  export MY_VAR=test
  ```

This cheat sheet covers the basics of Linux commands for file management, system information, networking, file permissions, text processing, and more.
