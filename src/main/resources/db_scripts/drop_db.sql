ALTER TABLE "deck" DROP CONSTRAINT IF EXISTS "deck_fk0";

ALTER TABLE "card_deck" DROP CONSTRAINT IF EXISTS "card_deck_fk0";

ALTER TABLE "card_deck" DROP CONSTRAINT IF EXISTS "card_deck_fk1";

DROP TABLE IF EXISTS "app_user";

DROP TABLE IF EXISTS "card";

DROP TABLE IF EXISTS "deck";

DROP TABLE IF EXISTS "card_deck";