# cloud-itonami-iso3166-png

**PNG**: Independent State of Papua New Guinea.

- National Procurement Commission (NPC) public-procurement compliance
  -- National Procurement Act 2018, as amended by the National
  Procurement (Amendment) Act 2021 (own Section 26(1) multi-tier
  procurement-value-threshold ladder: K50,000 / K1,000,000 /
  K10,000,000 / K5,000,000)
- Investment Promotion Authority (IPA) business/company registration
  (Companies Act 1997 via IPA's Companies Office) **and** foreign
  investment screening/certification (Investment Promotion Act 1992,
  s.28 Foreign Enterprise Certificate) -- IPA's own genuinely dual role
- Internal Revenue Commission (IRC) Tax Identification Number (TIN)
  registration (TIN1 non-individual / TIN2 individual)

AGPL-3.0-or-later.

## Market-entry / statute catalogs

Governed public-sector market-entry compliance actor, same architecture
as every other `cloud-itonami-iso3166-*` sibling:

- `src/marketentry/{facts,governor,phase,sim,operation,registry,store,
  marketentryllm}.cljc` -- the actor. `facts.cljc` cites the National
  Procurement Commission (a Statutory Body under the National
  Procurement Act 2018) and its own Section 26(1) procurement-threshold
  ladder (as substituted by the National Procurement (Amendment) Act
  2021); the Investment Promotion Authority (IPA)'s dual role as both
  PNG's company/business registrar (Companies Act 1997, Business Names
  Act, Business Groups Incorporation Act, Associations Incorporation
  Act) and its foreign-investment-certification authority (Investment
  Promotion Act 1992, s.28 Foreign Enterprise Certificate); and the
  Internal Revenue Commission (IRC)'s Taxpayer Identification Number
  (TIN) registration. `governor.cljc`'s flagship check independently
  recomputes whether an engagement's own declared foreign-ownership
  percentage actually exempts it from the Investment Promotion Act
  1992's own 50-percent Foreign Enterprise Certificate threshold -- an
  ownership-percentage-threshold test (IPA's own quoted definition:
  "a business entity which is wholly owned or that is 50 percent or
  more owned or controlled and managed by non-citizens"; this catalog
  does not force a different shape onto PNG's actual mechanism just to
  appear novel) -- see the namespace docstrings for the full research
  trail and honestly-narrowed scope, including facts this iteration
  could NOT verify (e.g. a local-representative/agent provision, and
  the historical claim that NPC replaced a "Central Supply and Tenders
  Board").
- `src/statute/facts.cljk` -- general-law catalog: the Companies Act
  1997 (company law) and the Employment Act 1978 / Chapter 373 (labour
  law, confirmed via a `web.archive.org` snapshot of PacLII's Papua New
  Guinea Consolidated Legislation database, since the live `paclii.org`
  returned a Cloudflare bot-detection challenge this session -- not
  bypassed).

Every citation is curl/WebFetch-verified against an official source
(`npc.gov.pg`, `www.ipa.gov.pg`); where the LIVE official site could
not be reached this session (`irc.gov.pg` is now a JavaScript SPA this
iteration could not query for substantive content; `paclii.org` served
a Cloudflare bot-detection challenge; `www.dlir.gov.pg` resolves to an
unrelated Outlook webmail login), the SAME official document was
instead read from a `web.archive.org` snapshot -- see
`marketentry.facts` / `statute.facts`'s docstrings for exactly which
facts are live-verified vs. archived-snapshot-verified vs. an
honestly-flagged gap.

## Culture catalog

Alongside the market-entry / statute catalogs, this repo carries a
**country-level regional-culture catalog** (ADR-2607171400 addendum 2,
`cloud-itonami-municipality-culture-catalog` Wave 1, in
`com-junkawasaki/root`) — national dishes, protected products, beverages,
crafts, festivals and heritage sites for Papua New Guinea:

- `src/culture/facts.cljk` — the catalog, source of truth (keyed by
  uppercase ISO3, mirroring `statute.facts`).
- `schema/culture.edn` — DataScript schema.
- `data/culture-tx.edn` — derived DataScript tx-data (regenerated from
  the catalog, never hand-edited).

City-level counterparts live in the `cloud-itonami-municipality-*` repos.
Same provenance discipline as the compliance catalogs: every entry cites a
source URL that was actually fetched and read on `:culture/retrieved-at`;
summaries state only what the cited source confirms. An item not in
`culture.facts/catalog` has no spec-basis — never fabricate one.
