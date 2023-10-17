
EXPECTED_BAKE_TIME = 40
PREPARATION_TIME = 2

def bake_time_remaining(elapsed_bake_time: int):
    """
    Calculate the bake time remaining.

    :param elapsed_bake_time: int - elapsed cooking time.
    :return: expected bake time (40 minutes) - int.

    This function takes one integer representing the time already spent baking and calculates
    the total elapsed minutes spent cooking the lasagna.
    """
    return EXPECTED_BAKE_TIME - elapsed_bake_time

def preparation_time_in_minutes(number_of_layers):
    """
    Calculate the preparation time in minutes.

    :param number_of_layers: int - the number of layers in the lasagna.
    :return: int * preparation time (2 minutes).

    function that takes the number of layers you want to add to the lasagna as an argument 
    and returns how many minutes you would spend making them.
    """
    return number_of_layers * PREPARATION_TIME

def elapsed_time_in_minutes(number_of_layers,elapsed_bake_time):
    """
    Calculate the elapsed cooking time.

    :param number_of_layers: int - the number of layers in the lasagna.
    :param elapsed_bake_time: int - elapsed cooking time.
    :return: int - total time elapsed (in minutes) preparing and cooking.

    This function takes two integers representing the number of lasagna layers and the
    time already spent baking and calculates the total elapsed minutes spent cooking the
    lasagna.
    """
    return (number_of_layers * PREPARATION_TIME) + elapsed_bake_time

#print(elapsed_time_in_minutes(2,20)) == 26


