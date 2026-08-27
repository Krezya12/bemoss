English | [Русский](README.ru.md)

# BeMoss

**BeMoss** is a lightweight, completely free IDE built specifically for Minecraft Bedrock
addon and pack creators.

It is based on the open-source IntelliJ Platform, surgically trimmed of everything a Bedrock
creator does not need — no Java, Python or Android tooling — so that it stays fast even on
low-end PCs.

> **Status: early development.** Public builds are not available yet.
> Follow the news in our Telegram channel: <https://t.me/mikchaz>

## Why BeMoss

- **Lightweight by design.** The heavyweight enterprise subsystems of the platform are cut out;
  only what Bedrock creators actually use stays in the product.
- **First-class JSON editing.** Bedrock packs are JSON at heart: syntax highlighting,
  completion and validation against the official Mojang `bedrock-schemas` (in progress).
- **Project wizards.** Create an addon, a behavior pack or a resource pack in a few clicks —
  with correct folder structure and manifests generated for you.
- **Git included.** Version your packs without leaving the IDE.
- **Cross-platform.** Windows, macOS and Linux.
- **Free forever.** Open source under the [Apache License 2.0](LICENSE.txt), no accounts,
  no telemetry-first mindset.

## Getting BeMoss

There are no downloadable builds yet. Once the first public build is ready, it will be announced
in [our Telegram channel](https://t.me/mikchaz).

## Building from Source

### Prerequisites

- [Git](https://git-scm.com/).
- On **Windows**, set these Git options to avoid common issues during cloning:

  ```shell
  git config --global core.longpaths true
  git config --global core.autocrlf input
  ```

Everything else (Bazel, JDK/JBR toolchains) is provisioned automatically by the bundled
wrapper scripts.

### Clone

```shell
git clone <repository-url>
cd bemoss
```

### Build and Run

| Command | What it does |
|---------|--------------|
| `./bazel.cmd build //bemoss:bemoss` | Compile the BeMoss plugin module |
| `./bazel.cmd run //build:idea_community` | Run the development IDE |
| `./installers.cmd` | Build distribution installers |

Note: while the standalone BeMoss product definition is being worked on, these commands produce
upstream-based artifacts.

## Contributing

BeMoss is in its formative stage — testing, feedback and spreading the word help just as much as
code. See [CONTRIBUTING.md](CONTRIBUTING.md) for how to report bugs, propose features and open
pull requests; ideas are also welcome in [our Telegram channel](https://t.me/mikchaz).

## License

BeMoss is licensed under the [Apache License 2.0](LICENSE.txt).

The product includes code from the IntelliJ Platform, Copyright JetBrains s.r.o.,
also licensed under the Apache License 2.0. See [NOTICE.txt](NOTICE.txt) for details.

## Disclaimer

BeMoss is not an official Minecraft product. It is not approved by or associated with Mojang
or Microsoft.
