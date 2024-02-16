package main

import (
	"github.com/AlecAivazis/survey/v2"
)

func main() {
	name := false
	prompt := &survey.Confirm{
		Message: "Do you like pie?",
	}
	survey.AskOne(prompt, &name)
}
