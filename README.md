## Git Conflict Resolution

**Project**: simple-bank - a banking system that allows to make transfers between accounts \
**Context**: We have two teams working on different features. We need to merge these features into the main branch

#### The branches:
**main**: The base version with a simple TransferService \
**feature/currencies-support**: Adds support for different currencies and an ExchangeRateService \
**feature/transaction-commissions**: Adds a 1% capped commission fee to transfers

#### Your objectives:
1. Clone the repository
2. Review: Look at the changes in feature/currencies-support and merge it into main
3. Integrate: Merge feature/transaction-commissions into main
4. Resolve Conflicts: You will hit a merge conflict in TransferService. Your goal is to resolve it so that both features work together correctly