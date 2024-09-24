# Chemical Warehouse Project

## Formål

Dette projekt styrer og organiserer kemikalieopbevaring på en effektiv måde. Formålet er at implementere en løsning, der håndterer processerne omkring varemodtagelse, lagerstyring og rapportering af kemikalier på et lager. Projektet er opbygget som en Scrum-baseret arbejdsproces for at sikre kontinuerlig udvikling og forbedring.

## Brug af GitHub Project Board

Vi anvender GitHub Project Board til at organisere og spore alle opgaver og user stories i projektet. Hver opgave (issue) bliver markeret med labels for at angive dens type og status.

### Labels

- **bug**: Bruges til at rapportere fejl i systemet, som kræver rettelse.
- **documentation**: Bruges til opgaver relateret til forbedring eller tilføjelse af dokumentation.
- **enhancement**: Bruges til at tilføje nye funktioner eller forbedringer til systemet.
- **help wanted**: Bruges til opgaver, der kræver ekstra opmærksomhed eller hjælp fra teamet.
- **InitialRepo**: Bruges til opgaver relateret til oprettelsen af den indledende projektstruktur.
- **wontfix**: Bruges til opgaver, der ikke vil blive arbejdet på.

### Procedurer for håndtering af issues

- **Oprettelse**: Issues repræsenterer både user stories og deres relaterede tasks. En user story beskriver en funktion, som brugerne har brug for, mens tasks bryder den ned i mindre trin (f.eks. udvikling af UI, databasestruktur, tests osv.).
- **Estimering**: Hver issue vil blive estimeret i form af tid eller kompleksitet, hvilket hjælper os med at planlægge sprintforløbet.
- **Draft issues**: Draft issues kan bruges som kladder til at planlægge user stories, før de færdiggøres og prioriteres.

## Workflow og Branch-strategi

Vi bruger GitHub Flow som branch-strategi:
- `main`: Indeholder al deployable kode.
- Feature branches: Bruges til at udvikle nye funktioner, der senere merges tilbage til `main`.