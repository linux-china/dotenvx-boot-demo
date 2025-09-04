Dotenvx Spring Boot demo
=========================

# Get Started with JetBrains IDE

Install [Dotenvx JetBrains Plugin](https://plugins.jetbrains.com/plugin/28148-dotenvx) from the plugin manager.

Open application.properties, and press `macOS: ⌘N` or `Windows/Linux: Alt+Insert` to popup `Generate` menu,
and select the options, such as `Add public key` or `Add encrypted variables`.

# Get Started with CLI

Download the last version of [dotenvx-cli](https://github.com/linux-china/dotenvx-rs/releases),
or install it by following the instructions below.

- homebrew: `brew install linux-china/tap/dotenvx-rs`
- cargo: `cargo binstall dotenvx-rs`
- shell: `curl --proto '=https' --tlsv1.2 -LsSf https://github.com/linux-china/dotenvx-rs/releases/download/v0.4.15/dotenvx-rs-installer.sh | sh`

Create your dotenvx key pair:

```bash
$ cd dotenvx-boot-demo
$ dotenvx set --encrypt nick Jackie
$ dotenvx -p test set --encrypt nick Tester
```

Then check your application.properties and start the application.

# References

- dotenvx-spring-boot: https://github.com/linux-china/dotenvx-spring-boot