package main

import (
	"fmt"
	"io/ioutil"
	"strings"
)

var entrycount = 0

type Journal struct {
	entries []string
}

func (j *Journal) AddEntry(text string) int {
	entrycount++
	entry := fmt.Sprintf("%d:%s", entrycount, text)
	j.entries = append(j.entries, entry)
	return entrycount
}
func (j *Journal) RemoveEntry(index int) {
	//...
}

//separation of concerns
//God Object
func (j *Journal) String() string {
	return ""
}
func (j *Journal) Save(file string) {
	_ = ioutil.WriteFile(file, []byte(j.String()), 0644)
}
func (j *Journal) Load(filename string) {

}
func (j *Journal) LoadFromWeb(filename string) {

}

var LineSeparator = "\n"

//  vioalating SRP
func saveTofile(j *Journal, filename string) {
	_ = ioutil.WriteFile(filename, []byte(strings.Join(j.entries, LineSeparator)), 0644)
}

// using SRP
type persistence struct {
	LineSeparator string
}

func (p *persistence) saveTofile(j *Journal, filename string) {
	_ = ioutil.WriteFile(filename, []byte(strings.Join(j.entries, p.LineSeparator)), 0644)
}
func main() {
	j := Journal{}
	j.AddEntry("I cried today")
	j.AddEntry("I cried yesterday")
	saveTofile(&j, "journal.txt")

	p := persistence{"\r\n"}
	p.saveTofile(&j, "journal.txt")
}
