"""Functions which helps the locomotive engineer to keep track of the train."""


def get_list_of_wagons(*args):
    """Return a list of wagons.

    :param: arbitrary number of wagons.
    :return: list - list of wagons.
    """

    return list(args)

#print(get_list_of_wagons(1, 7, 12, 3, 14, 8, 5))

def fix_list_of_wagons(each_wagons_id, missing_wagons):
    """Fix the list of wagons.

    :parm each_wagons_id: list - the list of wagons.
    :parm missing_wagons: list - the list of missing wagons.
    :return: list - list of wagons.
    """

    #Get first two numbers
    a,b, *rest = each_wagons_id

    #Add the first two numbers to the end of the list
    rest.append(a)
    rest.append(b)

    #Find the index of the number 1
    index_of_one = rest.index(1)

    #Move the number 1 to the first position
    rest.insert(0, rest.pop(index_of_one))

   #Add the missing wagons to the list at index 1
    rest[1:1] = missing_wagons

    return rest

#print(fix_list_of_wagons([4, 2, 1], [8, 6, 15]))

def add_missing_stops(route, **kwargs):
    """Add missing stops to route dict.

    :param route: dict - the dict of routing information.
    :param: arbitrary number of stops.
    :return: dict - updated route dictionary.
    """
    #Add the stops to the route dictionary
    value = {"stops": list(kwargs.values())}
    route.update(value)

    return route

#print(add_missing_stops({"from": "New York", "to": "Miami"},stop_1="Washington, DC", stop_2="Charlotte", stop_3="Atlanta",stop_4="Jacksonville", stop_5="Orlando"))


def extend_route_information(route, more_route_information):
    """Extend route information with more_route_information.

    :param route: dict - the route information.
    :param more_route_information: dict -  extra route information.
    :return: dict - extended route information.
    """
    route.update(more_route_information)
    return route

#print(extend_route_information({"from": "Berlin", "to": "Hamburg"}, {"length": "100", "speed": "50"}))

def fix_wagon_depot(wagons_rows):
    """Fix the list of rows of wagons.

    :param wagons_rows: list[list[tuple]] - the list of rows of wagons.
    :return: list[list[tuple]] - list of rows of wagons.
    """
    result = [list(items) for items in zip(*wagons_rows)]

    return result

print(fix_wagon_depot([[(2, 'red'), (4, 'red'), (8, 'red')], [(5, 'blue'), (9, 'blue'), (13, 'blue')], [(3, 'orange'), (7, 'orange'), (11, 'orange')]]))