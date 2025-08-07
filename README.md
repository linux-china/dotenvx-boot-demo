Dotenvx Spring Boot demo
=========================

# Get Started

Download the last version of [dotenvx-cli](https://github.com/linux-china/dotenvx-rs/releases),
or install it by following the instructions below.

- homebrew: `brew install linux-china/tap/dotenvx-rs`
- cargo: `cargo binstall dotenvx-rs`
- shell: `curl --proto '=https' --tlsv1.2 -LsSf https://github.com/linux-china/dotenvx-rs/releases/download/v0.4.3/dotenvx-rs-installer.sh | sh`
          
Create your dotenvx key pair: 

```bash
$ cd dotenvx-boot-demo
$ dotenvx set --encrypt nick Jackie
$ dotenvx -p test set --encrypt nick Tester
```

Then check your application.properties and start the application.


# References

- dotenvx-spring-boot: https://github.com/linux-china/dotenvx-spring-boot