"""Functions to help Azara and Rui locate pirate treasure."""


def get_coordinate(record):
    """Return coordinate value from a tuple containing the treasure name, and treasure coordinate.

    :param record: tuple - with a (treasure, coordinate) pair.
    :return: str - the extracted map coordinate.
    """
    #Return index 1
    return record[1]

#print(get_coordinate(('Scrimshawed Whale Tooth', '2A')))

def convert_coordinate(coordinate):
    """Split the given coordinate into tuple containing its individual components.

    :param coordinate: str - a string map coordinate
    :return: tuple - the string coordinate split into its individual components.
    """
    #Return split str as a tuple
    return tuple(coordinate)

#print(convert_coordinate("kelokewawea"))

def compare_records(azara_record, rui_record):
    """Compare two record types and determine if their coordinates match.

    :param azara_record: tuple - a (treasure, coordinate) pair.
    :param rui_record: tuple - a (location, tuple(coordinate_1, coordinate_2), quadrant) trio.
    :return: bool - do the coordinates match?
    """
    #Get index 1
    coordinates1 = azara_record[1]

    #Join chars in a tuple
    coordinates2 = ''.join(rui_record[1])

    if coordinates2 == coordinates1 :
        return True
    return False

#print(compare_records(('Model Ship in Large Bottle', '8A'), ('Harbor Managers Office', ('8', 'A'), 'purple')))

def create_record(azara_record, rui_record):
    """Combine the two record types (if possible) and create a combined record group.

    :param azara_record: tuple - a (treasure, coordinate) pair.
    :param rui_record: tuple - a (location, coordinate, quadrant) trio.
    :return: tuple or str - the combined record (if compatible), or the string "not a match" (if incompatible).
    """
    if compare_records(azara_record,rui_record) is True:
        return azara_record + rui_record
    return "not a match"

#print(create_record(('Brass Spyglass', '4B'), ('Abandoned Lighthouse', ('4', 'B'), 'Blue')))

def clean_up(combined_record_group):
    """Clean up a combined record group into a multi-line string of single records.

    :param combined_record_group: tuple - everything from both participants.
    :return: str - everything "cleaned", excess coordinates and information are removed.

    The return statement should be a multi-lined string with items separated by newlines.

    (see HINTS.md for an example).
    """
    cleaned_records = []

    for record in combined_record_group:
        # Unpack the elements from the record
        treasure_name, treasure_code, location_name, coordinates, color = record

        # Create a cleaned record tuple without excess information
        cleaned_record = (treasure_name, location_name, coordinates, color)

        # Convert the cleaned record tuple to a string and append it to the list
        cleaned_records.append(str(cleaned_record))

    # Join the cleaned record strings with newline characters to create the final output
    return '\n'.join(cleaned_records)

print(clean_up((('Brass Spyglass', '4B', 'Abandoned Lighthouse', ('4', 'B'), 'Blue'), ('Vintage Pirate Hat', '7E', 'Quiet Inlet (Island of Mystery)', ('7', 'E'), 'Orange'), ('Crystal Crab', '6A', 'Old Schooner', ('6', 'A'), 'Purple'))))
print("hola")