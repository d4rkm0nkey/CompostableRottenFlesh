# Compostable Rotten Flesh

Fabric mod that lets you put rotten flesh into a composter (30% chance per item to add a layer,
like grass or seeds). Works with hoppers too. Needed on the server (or in singleplayer), not on clients
joining a server.

## Branches

Each Minecraft version (group) has its own branch, e.g. `26.1`, `26.2`, `26.3`. All version-specific
values live in that branch's `gradle.properties`.

## Publishing

The `publish` GitHub workflow builds the selected branch and uploads it to CurseForge and Modrinth
(Actions > publish > Run workflow, or publish a GitHub release). It needs the repository secrets
`CURSEFORGE_TOKEN` and `MODRINTH_TOKEN`. Locally, `./gradlew publishMods` does a dry run when the
tokens are not set.
