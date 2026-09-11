(ns culture.facts
  "Country-level regional-culture catalog for Papua New Guinea (PNG) --
  national dishes, protected products, beverages, crafts, festivals and
  heritage sites, per ADR-2607171400 addendum 2 (cloud-itonami-
  municipality-culture-catalog Wave 1, in com-junkawasaki/root). Sibling
  namespace to `marketentry.facts` / `statute.facts` (ADR-2607141700);
  city-level counterparts live in the cloud-itonami-municipality-* repos.

  Catalog is keyed by UPPERCASE ISO3 (mirrors `statute.facts`); entries
  carry no :culture/municipality (that attribute is city-level only).

  Every entry cites a source URL that was actually fetched and read on
  :culture/retrieved-at -- never fabricated. Summaries state only what the
  cited source confirms. An item not in this table has NO spec-basis, full
  stop; extend `catalog`, do not invent an id/url.

  A candidate `bilum` bag entry was dropped: the `Bilum` Wikipedia title
  redirects to `Noken`, an article about a related but distinct bag
  tradition of Western New Guinea (Indonesia), not Papua New Guinea. A
  candidate Huli-wigmen craft entry was also dropped: the `Huli_people`
  article confirms the headdress tradition only via image captions, with
  no substantive body-text paragraph -- too thin to cite honestly as a
  standalone catalog item.")

(def catalog
  "iso3 -> vector of culture entries."
  {"PNG"
   [{:culture/id "png.dish.mumu"
     :culture/name "Mumu"
     :culture/country "PNG"
     :culture/kind :dish
     :culture/summary "Regarded as the national dish of Papua New Guinea: pork or chicken with sweet potato, taro, plantains and leafy vegetables cooked in an earth oven and wrapped in banana leaves; the mumu earth-oven cooking method is also found elsewhere in the Pacific."
     :culture/url "https://en.wikipedia.org/wiki/Papua_New_Guinean_cuisine"
     :culture/url-provenance :wikipedia-en
     :culture/retrieved-at "2026-07-17"}
    {:culture/id "png.dish.kokoda"
     :culture/name "Kokoda"
     :culture/country "PNG"
     :culture/kind :dish
     :culture/summary "Papua New Guinean dish of fish cooked in a lime-coconut sauce, similar to ceviche; the same dish name is also present in Fijian cuisine."
     :culture/url "https://en.wikipedia.org/wiki/Papua_New_Guinean_cuisine"
     :culture/url-provenance :wikipedia-en
     :culture/retrieved-at "2026-07-17"}
    {:culture/id "png.dish.dia"
     :culture/name "Dia"
     :culture/country "PNG"
     :culture/kind :dish
     :culture/summary "Papua New Guinean dessert of a sago-and-banana dumpling steamed in a banana-leaf wrapping and served with clotted coconut cream; also known as pariwa."
     :culture/url "https://en.wikipedia.org/wiki/Papua_New_Guinean_cuisine"
     :culture/url-provenance :wikipedia-en
     :culture/retrieved-at "2026-07-17"}
    {:culture/id "png.beverage.kulau"
     :culture/name "Kulau"
     :culture/country "PNG"
     :culture/kind :beverage
     :culture/summary "A green coconut filled with sweet, slightly tangy coconut water, drunk as a traditional beverage in Papua New Guinea."
     :culture/url "https://en.wikipedia.org/wiki/Papua_New_Guinean_cuisine"
     :culture/url-provenance :wikipedia-en
     :culture/retrieved-at "2026-07-17"}
    {:culture/id "png.craft.kundu"
     :culture/name "Kundu"
     :culture/country "PNG"
     :culture/kind :craft
     :culture/summary "Hourglass drum used in Papua New Guinea to accompany formal occasions, religious ceremonies and celebrations, culturally significant enough to appear on the country's coat of arms."
     :culture/url "https://en.wikipedia.org/wiki/Kundu_(drum)"
     :culture/url-provenance :wikipedia-en
     :culture/retrieved-at "2026-07-17"}
    {:culture/id "png.product.betel-nut"
     :culture/name "Betel nut"
     :culture/name-local "Buai"
     :culture/country "PNG"
     :culture/kind :product
     :culture/summary "In Papua New Guinea, betel nuts are known in Tok Pisin as buai and grow abundantly on the northern coast around Wewak and Madang, where they are widely chewed; betel-nut chewing is a broader practice shared across parts of Asia and the Pacific, not exclusive to PNG."
     :culture/url "https://en.wikipedia.org/wiki/Areca_nut"
     :culture/url-provenance :wikipedia-en
     :culture/retrieved-at "2026-07-17"}
    {:culture/id "png.festival.goroka-show"
     :culture/name "Goroka Show"
     :culture/country "PNG"
     :culture/kind :festival
     :culture/summary "Well-known tribal gathering and cultural event in Papua New Guinea held annually near the country's Independence Day in Goroka, where around 100 tribes showcase their music, dance and cultural traditions."
     :culture/url "https://en.wikipedia.org/wiki/Goroka_Show"
     :culture/url-provenance :wikipedia-en
     :culture/retrieved-at "2026-07-17"}
    {:culture/id "png.heritage.kuk-swamp"
     :culture/name "Kuk Swamp"
     :culture/country "PNG"
     :culture/kind :heritage
     :culture/summary "Archaeological site in the Western Highlands recognized in 2008 as a UNESCO World Heritage Site, as one of the places in the world where people independently developed agriculture."
     :culture/url "https://en.wikipedia.org/wiki/Kuk_Swamp"
     :culture/url-provenance :wikipedia-en
     :culture/retrieved-at "2026-07-17"}]})

(defn spec-basis [iso3] (get catalog iso3))

(defn coverage
  ([] (coverage (keys catalog)))
  ([iso3s]
   (let [have (filter catalog iso3s)
         missing (remove catalog iso3s)]
     {:requested (count iso3s)
      :covered (count have)
      :covered-jurisdictions (vec (sort have))
      :missing-jurisdictions (vec (sort missing))
      :note (str "cloud-itonami-iso3166-png culture catalog "
                 "(ADR-2607171400 addendum 2, Wave 1): " (count (get catalog "PNG"))
                 " PNG entries, each with a fetched-and-read citation. "
                 "Extend `culture.facts/catalog`, never fabricate an id/url.")})))

(defn by-kind [iso3 kind]
  (filterv #(= (:culture/kind %) kind) (spec-basis iso3)))
