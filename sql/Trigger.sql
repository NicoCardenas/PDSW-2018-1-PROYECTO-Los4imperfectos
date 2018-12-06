CREATE OR REPLACE FUNCTION autoIntention() RETURNS trigger AS $auto_increment_id$
	BEGIN
		New.id := (select count(*)+1 from intention);
		new.date_of_creation := current_timestamp;
		Return NEW;
	END;
$auto_increment_id$ LANGUAGE plpgsql;

CREATE TRIGGER auto_increment_id
	BEFORE INSERT ON intention
	FOR EACH ROW
	EXECUTE PROCEDURE autoIntention();
	
